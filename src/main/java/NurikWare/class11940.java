package NurikWare;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import java.util.UUID;

public record class11940(ByteBuf parent, short protocolVersion) {
   public static Object L_0;

   public void L(int var1) {
      this.parent.writeByte(var1);
   }

   public short L() {
      return this.parent.readShort();
   }

   public long M() {
      return this.parent.readLong();
   }

   public String P() {
      return this.i(32767);
   }

   private static void T() {
      L_0 = 32767;
   }

   public class11940(ByteBuf var1) {
      this(var1, (short)16);
   }

   public class11940(ByteBuf parent, short protocolVersion) {
      super();
      this.parent = parent;
      this.protocolVersion = protocolVersion;
   }

   static {
      T();
   }

   public boolean B() {
      return this.parent.readBoolean();
   }

   public float Z() {
      return this.parent.readFloat();
   }

   public String i(int var1) {
      return class10792.N(this.parent, var1);
   }

   public double i() {
      return this.parent.readDouble();
   }

   public void s() {
      this.parent.release();
   }

   public byte[] m() {
      byte[] abyte = new byte[this.R()];
      this.parent.readBytes(abyte);
      return abyte;
   }

   public UUID U() {
      long i = this.M();
      long j = this.M();
      return new UUID(i, j);
   }

   public short z() {
      return this.protocolVersion;
   }

   public byte[] u(int var1) {
      int i = this.R();
      if (i < 0) {
         throw new DecoderException("The received byte array length is less than zero! Weird length!");
      } else if (i > var1) {
         throw new DecoderException("The received byte array length is longer than maximum allowed (" + i + " > " + var1 + ")");
      } else {
         int j = this.parent.readableBytes();
         if (i > j) {
            throw new DecoderException("Not enough bytes in buffer, expected " + i + ", but got " + j);
         } else {
            byte[] abyte = new byte[i];
            this.parent.readBytes(abyte);
            return abyte;
         }
      }
   }

   public char u() {
      return this.parent.readChar();
   }

   public int y() {
      return this.parent.readableBytes();
   }

   public class11940 y(ByteBuf var1) {
      return this.parent == var1 ? this : new class11940(var1, this.protocolVersion);
   }

   public void y(int var1) {
      this.parent.writeInt(var1);
   }

   public byte E() {
      return this.parent.readByte();
   }

   public void N(ByteBuf var1) {
      this.parent.writeBytes(var1);
   }

   public void N(boolean var1) {
      this.parent.writeBoolean(var1);
   }

   public void N(float var1) {
      this.parent.writeFloat(var1);
   }

   public void N(short var1) {
      this.parent.writeShort(var1);
   }

   public void N(ByteBuf var1, int var2, int var3) {
      this.parent.writeBytes(var1, var2, var3);
   }

   public class11940 N(String var1) {
      class10792.N(this.parent, var1, 32767);
      return this;
   }

   public ByteBuf N(int var1) {
      return this.parent.readBytes(var1);
   }

   public void N(byte[] var1) {
      this.y(var1.length);
      this.parent.writeBytes(var1);
   }

   public String[] N() {
      int i = this.R();
      String[] astring = new String[i];

      for (int j = 0; j < i; j++) {
         astring[j] = this.P();
      }

      return astring;
   }

   public void N(UUID var1) {
      this.N(var1.getMostSignificantBits());
      this.N(var1.getLeastSignificantBits());
   }

   public void N(Enum<?> var1) {
      this.y(var1.ordinal());
   }

   public void N(String[] var1) {
      this.y(var1.length);

      for (String s : var1) {
         this.N(s);
      }
   }

   public void N(long var1) {
      this.parent.writeLong(var1);
   }

   public void N(char var1) {
      this.parent.writeChar(var1);
   }

   public <T extends Enum<T>> T N(Class<T> var1) {
      int i = this.R();
      return (T)var1.getEnumConstants()[i];
   }

   public void N(double var1) {
      this.parent.writeDouble(var1);
   }

   public ByteBuf W() {
      return this.parent;
   }

   public int R() {
      return this.parent.readInt();
   }
}
