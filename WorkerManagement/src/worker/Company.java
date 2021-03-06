package worker;

import java.util.ArrayList;

public class Company {
	
	ArrayList<Worker> workers = new ArrayList<>();
	
	public boolean addWorker(int id, String name, String joinDate) {
		if(findOverlappingWorker(id) == null) {
			Worker worker = new Worker(id, name, joinDate);
			workers.add(worker);
			return true;
		}
		return false;
	}
	
	public Integer findOverlappingWorker(int id) {
		for(int i = 0; i < workers.size(); i++) {
			if(id == workers.get(i).getId()) return i;
		}
		return null;
	}
	
	public boolean deleteWorker(int id) {
		if(findOverlappingWorker(id) != null) {
			workers.remove((int)findOverlappingWorker(id));
			return true;
		}
		else return false;
	}
	
	public void printWorkerList() {
		for(Worker worker : workers) {
			System.out.println(worker.getId() + "\t" + worker.getName() + "\t" + worker.getJoinDate());
		}
	}
	
	public boolean updateWorker(int id_find, int id_new, String name, String joinDate) {
		if(findOverlappingWorker(id_find) != null) {
			Worker worker = workers.get(findOverlappingWorker(id_find));
			worker.setId(id_new);
			worker.setName(name);
			worker.setJoinDate(joinDate);
			return true;
		}
		else return false;
	}
}