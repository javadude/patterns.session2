package com.javadude.collections;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ObservableListWrapper<T> implements List<T> {
	private List<T> realList = new ArrayList<T>();
	private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		pcs.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		pcs.removePropertyChangeListener(listener);
	}

	public void addPropertyChangeListener(String propertyName,
			PropertyChangeListener listener) {
		pcs.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(String propertyName,
			PropertyChangeListener listener) {
		pcs.removePropertyChangeListener(propertyName, listener);
	}

	public void forEach(Consumer<? super T> action) {
		realList.forEach(action);
	}

	public int size() {
		return realList.size();
	}

	public boolean isEmpty() {
		return realList.isEmpty();
	}

	public boolean contains(Object o) {
		return realList.contains(o);
	}

	public Iterator<T> iterator() {
		return realList.iterator();
	}

	public Object[] toArray() {
		return realList.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return realList.toArray(a);
	}

	public boolean add(T e) {
		boolean v = realList.add(e);
		pcs.firePropertyChange("list", null, this);
		return v;
	}

	public boolean remove(Object o) {
		boolean v = realList.remove(o);
		pcs.firePropertyChange("list", null, this);
		return v;
	}

	public boolean containsAll(Collection<?> c) {
		return realList.containsAll(c);
	}

	public boolean addAll(Collection<? extends T> c) {
		return realList.addAll(c);
	}

	public boolean addAll(int index, Collection<? extends T> c) {
		return realList.addAll(index, c);
	}

	public boolean removeAll(Collection<?> c) {
		return realList.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return realList.retainAll(c);
	}

	public void replaceAll(UnaryOperator<T> operator) {
		realList.replaceAll(operator);
	}

	public boolean removeIf(Predicate<? super T> filter) {
		return realList.removeIf(filter);
	}

	public void sort(Comparator<? super T> c) {
		realList.sort(c);
	}

	public void clear() {
		realList.clear();
	}

	public boolean equals(Object o) {
		return realList.equals(o);
	}

	public int hashCode() {
		return realList.hashCode();
	}

	public T get(int index) {
		return realList.get(index);
	}

	public T set(int index, T element) {
		return realList.set(index, element);
	}

	public void add(int index, T element) {
		realList.add(index, element);
	}

	public Stream<T> stream() {
		return realList.stream();
	}

	public T remove(int index) {
		return realList.remove(index);
	}

	public Stream<T> parallelStream() {
		return realList.parallelStream();
	}

	public int indexOf(Object o) {
		return realList.indexOf(o);
	}

	public int lastIndexOf(Object o) {
		return realList.lastIndexOf(o);
	}

	public ListIterator<T> listIterator() {
		return realList.listIterator();
	}

	public ListIterator<T> listIterator(int index) {
		return realList.listIterator(index);
	}

	public List<T> subList(int fromIndex, int toIndex) {
		return realList.subList(fromIndex, toIndex);
	}

	public Spliterator<T> spliterator() {
		return realList.spliterator();
	}

	
}
