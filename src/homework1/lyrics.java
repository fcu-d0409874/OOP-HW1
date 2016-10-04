package homework1;

public class lyrics {
	public static void main(String[] args) {
		String lyrics = "Let it go! Let it go! Cannot hold it back anymore.";
		String lyrics1 = lyrics.replaceAll(" it ", " \"her\" ");
		String lyrics2 = lyrics1.replaceAll("Cannot", "Can't");
		lyrics = lyrics2;
		System.out.println(lyrics);
	}

}
