import java.util.ArrayList;
import java.util.List;

/*
 * Given an m x n board of characters and a list of strings words, return all words on the board.
 * Each word must be constructed from letters of sequentially adjacent cells, 
 * where adjacent cells are horizontally or vertically neighboring. 
 * The same letter cell may not be used more than once in a word.
 * 
 * Input: 
 * board = [["o","a","a","n"],
 *          ["e","t","a","e"],
 *          ["i","h","k","r"],
 *          ["i","f","l","v"]], 
 * words = ["oath","pea","eat","rain"]
 * Output: ["eat","oath"]
 * 
 * https://leetcode.com/problems/word-search-ii/
 */


public class WordSearch {
	 public List<String> findWords(char[][] board, String[] words) 
	    {        
	        List<String> result = new ArrayList();
	        for (String word : words)
	        {
	            boolean found = false;
	            for (int i = 0; i < board.length; ++i)
	            {
	                for (int j = 0; j < board[i].length; ++j)
	                {
	                    if (dfs(board, i, j, word, 0))
	                    {
	                        found = true;
	                        break;
	                    }
	                }
	                if (found)
	                {
	                    result.add(word);
	                    break;
	                }
	            }
	        }
	        
	        return result;
	    }
	    
	    
	    int[][] dir_ = {{-1,0},{1,0},{0,-1},{0,1}};
	    boolean dfs(char[][] board, int i, int j, String word, int pos)
	    {
	        if (pos == word.length()) return true;
	        if (i < 0 || i == board.length || j < 0 || j == board[i].length) return false;
	        if (board[i][j] != word.charAt(pos)) return false;
	        char c = board[i][j];
	        board[i][j] = '.';
	        for (int[] d : dir_)
	        {
	            if (dfs(board, i + d[0], j + d[1], word, pos + 1))
	            {
	                board[i][j] = c;
	                return true;
	            }
	        }
	        board[i][j] = c;
	        return false;
	    }

}
