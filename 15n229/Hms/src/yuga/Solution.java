package yuga;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static void main(String[] args) {
		UserProfile s = new UserProfile();
		s.setFirstName("indu");
		s.setEmail_id("12345@gmail.com");
		s.setDepartment("15n229");
		s.setGender("female");
		s.setLastName("shini");
		s.setDateOfBirth("may24");
		s.setGurdianName("siniiii");
		s.setJoinedDate(23);
		s.setPhoneNumber(2324545);
		s.setProfileId(235);
		s.setUserId(45);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
