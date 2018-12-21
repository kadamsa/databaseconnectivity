/**
 * 
 */
package com.sachin.web.daoImpl;

import java.sql.*;

import java.sql.PreparedStatement;
import com.sachin.web.dao.GetCon;
import com.sachin.web.model.User;

/**
 * @author sachinkadam2712@gmail.com
 *
 * 
 */
public class UserDaoImpl {

	public User getUser(int uid) {
		User u = new User();
		Connection con = GetCon.getCon();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("select * from usermst where uid=" + uid);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				u.setUid(rs.getInt(1));
				u.setUname(rs.getString(2));
				u.setAddress(rs.getString(3));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return u;
	}
}
