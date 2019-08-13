package com.cts.mymoviedb.bean;

public class SearchBean {
  private String search;

public String getSearch() {
	return search;
}

public void setSearch(String search) {
	this.search = search;
}


@Override
public String toString() {
	return "SearchBean [search=" + search + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((search == null) ? 0 : search.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	SearchBean other = (SearchBean) obj;
	if (search == null) {
		if (other.search != null)
			return false;
	} else if (!search.equals(other.search))
		return false;
	return true;
}
  
  
  
}
