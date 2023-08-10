package week4day3assignment;

	public class Desktop extends computer {
		public void desktopSize() {
			System.out.println("18 inches");
		}
		public static void main(String[] args) {
			Desktop electronics=new Desktop();
			electronics.computerModel();
			electronics.desktopSize();
		}


}
