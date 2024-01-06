package kadai_007;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Posts_Chapter07 {

	public static void main(String[] args) {
		
		Connection con = null;
        PreparedStatement statement = null;
        
       
        try {
        	con = DriverManager.getConnection(
					"jdbc:mysql://localhost/challenge_java",
					"root",
					"Ch9kcahoem3!"
					);
        	System.out.println("データベース接続成功");
        	
        	  	    String sql = "INSERT INTO posts (user_id, posted_at, post_content,likes) VALUES" +
        	  	    		 "(1003,'2023-02-08','昨日の夜は徹夜でした・・',13)," +
        	                 "(1002,'2023-02-08','お疲れ様です！',12)," +
        	                 "(1003,'2023-02-09','今日も頑張ります！',18)," +
        	                 "(1001,'2023-02-09','無理は禁物ですよ！',17)," +
        	                 "(1002,'2023-02-10','明日から連休ですね！',20);";
        	  	    statement = con.prepareStatement(sql);
        	  	    int rowCnt = statement.executeUpdate(sql);
        	  	    
        	  	    System.out.println("レコードを追加します");
        	  	    System.out.println(rowCnt +"件のレコードが追加されました");
        	  	    
        	  	    
        	  	    String sql2 = "SELECT* FROM posts WHERE user_id = 1002;";
        	  	    
        	  	    ResultSet result = statement.executeQuery(sql2);
        	  	    System.out.println("ユーザーIDが1002のレコードを検索しました");
        	  	    
        	  	    while(result.next()) {
        	  	    	Date postedAt = result.getDate("posted_at");
        	  	    	String postContent = result.getString("post_content");
        	  	    	String likes = result.getString("likes");
        	  	        System.out.println(result.getRow()+ "件目:投稿日時=" + postedAt + "/投稿内容=" + postContent + "/いいね数 =" + likes);
        	  	    	
        	  	    }
        }
        	  	  catch(SQLException e) {
        	          System.out.println("エラー発生：" + e.getMessage());
        	      } finally {
        	          // 使用したオブジェクトを解放
        	          if( statement != null ) {
        	              try { statement.close(); } catch(SQLException ignore) {}
        	          }
        	          if( con != null ) {
        	              try { con.close(); } catch(SQLException ignore) {}
        	
        	
        }
		
        	      }
	}
}
