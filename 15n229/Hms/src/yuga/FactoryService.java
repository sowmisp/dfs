package yuga;
import org.hibernate.SessionFactory;
public class FactoryService {
		protected SessionFactory factory;
        public FactoryService() {
			super();
			this.factory = HBFactory.get();
		}

		public SessionFactory get() {
			return factory;
		}

	}

