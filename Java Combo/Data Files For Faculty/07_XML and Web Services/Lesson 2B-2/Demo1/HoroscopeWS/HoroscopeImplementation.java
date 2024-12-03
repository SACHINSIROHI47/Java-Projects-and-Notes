package horoscope;

import java.rmi.RemoteException;
import java.sql.*;

public class HoroscopeImplementation implements HoroscopeInterface
{
	public String getSunSignTrait(int sunsign) throws RemoteException
	{
		String sunSignTrait[] = new String[12];
		/* Aries sun sign trait */
		sunSignTrait[0] = "Arians are adventurous, ambitious, impulsive, enthusiastic, and full of energy.";
		/* Taurus sun sign trait */
		sunSignTrait[1] = "Taureans are practical, stable, conservative, and lovers of peace.";
		/* Gemini sun sign trait */
		sunSignTrait[2] = "Geminis are dual-natured, elusive, complex, and contradictory.";
		/* Cancer sun sign trait */
		sunSignTrait[3] = "Cancerians are timid and shy. They are also dull and conservative.";
		/* Leo sun sign trait */
		sunSignTrait[4] = "Leos are ambitious, courageous, strong-willed, independent, and self-confident.";
		/* Virgo sun sign trait */
		sunSignTrait[5] = "Virgos are characterized by preciseness, refinement, love for cleanliness, hygiene, and good order.";
		/* Libra sun sign trait */
		sunSignTrait[6] = "Librans are elegant, charming, naturally kind, gentle, and lovers of beauty, harmony and justice.";
		/* Scorpio sun sign trait */
		sunSignTrait[7] = "Scorpios are the most intense, profound, and powerful among the zodiacs.";
		/* Sagittarius sun sign trait */
		sunSignTrait[8] = "Sagittarians are full of energy, versatility, adventurousness, and eagerness to extend experience.";
		/* Capricorn sun sign trait */
		sunSignTrait[9] = "Capricorns are confident, strong-willed, and calm.";
		/* Aquarius sun sign trait */
		sunSignTrait[10] = "Aquarians basically possess strong and attractive personalities.";
		/* Pisces sun sign trait */
		sunSignTrait[11] = "Pisceans are gentle, patient, malleable, generous, friendly, creative, and sensitive to others' feelings.";
		
		switch(sunsign)
		{
			case 0:
				/* Returns sun sign trait of Aries */
				return sunSignTrait[0];
			case 1:
				/* Returns sun sign trait of Taurus */
				return sunSignTrait[1];
			case 2:
				/* Returns sun sign trait of Gemini */
				return sunSignTrait[2];
			case 3:
				/* Returns sun sign trait of Cancer */
				return sunSignTrait[3];
			case 4:
				/* Returns sun sign trait of Leo */
				return sunSignTrait[4];
			case 5:
				/* Returns sun sign trait of Virgo */
				return sunSignTrait[5];
			case 6:
				/* Returns sun sign trait of Libra */
				return sunSignTrait[6];
			case 7:
				/* Returns sun sign trait of Scorpio */
        		return sunSignTrait[7];
			case 8:
				/* Returns sun sign trait of Sagittarius */
				return sunSignTrait[8];
			case 9:
				/* Returns sun sign trait of Capricorn */
				return sunSignTrait[9];
			case 10:
				/* Returns sun sign trait of Aquarius */
				return sunSignTrait[10];
			case 11:
				/* Returns sun sign trait of Pisces */
				return sunSignTrait[11];
		default:
				return null;
		}
	}
}
