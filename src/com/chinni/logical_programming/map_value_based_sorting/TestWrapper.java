package com.chinni.logical_programming.map_value_based_sorting;

public class TestWrapper {
	private long id;
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		int result = 31;
		result +=   (int)  id;
		result +=   ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof TestWrapper){
			return ((TestWrapper) obj).getId()==this.getId() &&  ((TestWrapper) obj).getName().equalsIgnoreCase(this.getName());
		}
		return false;
	}

	@Override
	public String toString() {
		return "TestWrapper [id=" + id + ", name=" + name + "]";
	}

}
