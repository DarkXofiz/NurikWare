package NurikWare;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import minecraft.class02657;
import minecraft.class04189;
import org.jspecify.annotations.Nullable;

public class class09539<T> extends AbstractList<T> implements class02657<T> {
   private final class04189<T> y;

   public class09539(class04189<T> var1, class04189 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public T remove(int var1) {
      return (T)this.y.remove(this.N(var1));
   }

   @Override
   public int size() {
      return this.y.size();
   }

   @Override
   public T get(int var1) {
      return (T)this.y.get(this.N(var1));
   }

   @Override
   public int indexOf(Object var1) {
      return this.N(this.y.lastIndexOf(var1));
   }

   @Override
   public void clear() {
      this.y.clear();
   }

   @Override
   public int lastIndexOf(Object var1) {
      return this.N(this.y.indexOf(var1));
   }

   @Override
   public boolean isEmpty() {
      return this.y.isEmpty();
   }

   @Override
   public void add(int var1, T var2) {
      this.y.add(this.N(var1) + 1, var2);
   }

   @Override
   public List<T> subList(int var1, int var2) {
      return this.y.subList(this.N(var2) + 1, this.N(var1) + 1).reversed();
   }

   @Override
   public Iterator<T> iterator() {
      return this.y.descendingIterator();
   }

   @Override
   public boolean contains(Object var1) {
      return this.y.contains(var1);
   }

   @Override
   public T set(int var1, T var2) {
      return (T)this.y.set(this.N(var1), var2);
   }

   public class02657<T> y() {
      return this.y;
   }

   @Override
   public T getFirst() {
      return (T)this.y.getLast();
   }

   @Override
   public T getLast() {
      return (T)this.y.getFirst();
   }

   @Override
   public void addFirst(T var1) {
      this.y.addLast(var1);
   }

   @Override
   public void addLast(T var1) {
      this.y.addFirst(var1);
   }

   @Override
   public T removeFirst() {
      return (T)this.y.removeLast();
   }

   @Override
   public T removeLast() {
      return (T)this.y.removeFirst();
   }

   @Nullable
   public T pollFirst() {
      return (T)this.y.pollLast();
   }

   @Nullable
   public T pollLast() {
      return (T)this.y.pollFirst();
   }

   public boolean offerLast(T var1) {
      return this.y.offerFirst(var1);
   }

   @Nullable
   public T peekFirst() {
      return (T)this.y.peekLast();
   }

   public boolean removeFirstOccurrence(Object var1) {
      return this.y.removeLastOccurrence(var1);
   }

   public boolean offerFirst(T var1) {
      return this.y.offerLast(var1);
   }

   @Nullable
   public T peekLast() {
      return (T)this.y.peekFirst();
   }

   public boolean removeLastOccurrence(Object var1) {
      return this.y.removeFirstOccurrence(var1);
   }

   public Iterator<T> descendingIterator() {
      return this.y.iterator();
   }

   private int N(int var1) {
      return var1 == -1 ? -1 : this.y.size() - 1 - var1;
   }
}
