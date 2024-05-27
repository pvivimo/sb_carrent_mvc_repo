package pv.sb_carrent_mvc.db;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.SelectionQuery;
import org.springframework.stereotype.Repository;

import pv.sb_carrent_mvc.model.Car;
import pv.sb_carrent_mvc.model.Reservation;

@Repository
public class Database {
	
	private SessionFactory sessionFactory;

	public Database() {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	
	public List<Car> getAllCars(){
		
		List<Car> cars = null;
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		SelectionQuery<Car> query = session.createSelectionQuery
				("SELECT c FROM Car c", Car.class);
		cars = query.getResultList();
		
		tx.commit();
		session.close();
		
		return cars;
	}
	
	public Car getCarById(int id) {
		
		Car car = null;
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		car = session.get(Car.class, id);
		
		tx.commit();
		session.close();
		
		return car;
	}
	
	public void saveReservation(Reservation reservation) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(reservation);
		
		tx.commit();
		session.close();
	}
	
	 

}
