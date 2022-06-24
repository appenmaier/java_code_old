package exercises.ulm;

/**
 * https://studium.hs-ulm.de/de/org/I/vorkurse/Documents/java_aufgaben.pdf
 * Aufgabe Methoden-4
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseMethoden04 {

	public static void main(String[] args) {

		String decryptedText = "Jrvg uvagra, uvagre qra Jbegoretra, srea qre Yäaqre Ibxnyvra haq Xbafbanagvra yrora "
				+ "qvr Oyvaqgrkgr. Notrfpuvrqra jbuara fvr va Ohpufgnounhfra na qre Xüfgr qrf Frznagvx, "
				+ "rvarf tebßra Fcenpubmrnaf. Rva xyrvarf Oäpuyrva anzraf Qhqra syvrßg qhepu vuera Beg "
				+ "haq irefbetg fvr zvg qra aögvtra Ertryvnyvra. Rf vfg rva cnenqvrfzngvfpurf Ynaq, va "
				+ "qrz rvarz troengrar Fngmgrvyr va qra Zhaq syvrtra. Avpug rvazny iba qre nyyzäpugvtra "
				+ "Vagrechaxgvba jreqra qvr Oyvaqgrkgr orureefpug – rva trenqrmh habegubtencuvfpurf "
				+ "Yrora. Rvarf Gntrf nore orfpuybß rvar xyrvar Mrvyr Oyvaqgrkg, vue Anzr jne Yberz "
				+ "Vcfhz, uvanhf mh trura va qvr jrvgr Tenzzngvx. Qre tebßr Bkzbk evrg vue qniba no, qn "
				+ "rf qbeg jvzzryr iba oöfra Xbzzngn, jvyqra Sentrmrvpura haq uvagreuäygvtra Frzvxbyv, "
				+ "qbpu qnf Oyvaqgrkgpura yvrß fvpu avpug orveera. Rf cnpxgr frvar fvrora Irefnyvra, "
				+ "fpubo fvpu frva Vavgvny va qra Tüegry haq znpugr fvpu nhs qra Jrt. Nyf rf qvr refgra "
				+ "Uütry qrf Xhefvitrovetrf rexybzzra unggr, jnes rf rvara yrgmgra Oyvpx mheüpx nhs qvr "
				+ "Fxlyvar frvare Urvzngfgnqg Ohpufgnounhfra, qvr Urnqyvar iba Nycunorgqbes haq qvr "
				+ "Fhoyvar frvare rvtrara Fgenßr, qre Mrvyratnffr. Jruzügvt yvrs vuz rvar eurgbevfpur "
				+ "Sentr üore qvr Jnatr, qnaa frgmgr rf frvara Jrt sbeg. Hagrejrtf gens rf rvar Pbcl. Qvr "
				+ "Pbcl jneagr qnf Oyvaqgrkgpura, qn, jb fvr urexäzr jäer fvr mvtzny hztrfpuevrora jbeqra "
				+ "haq nyyrf, jnf iba vuerz Hefcehat abpu üoevt jäer, frv qnf Jbeg \"haq\" haq qnf "
				+ "Oyvaqgrkgpura fbyyr hzxruera haq jvrqre va frva rvtrarf, fvpurerf Ynaq mheüpxxruera. "
				+ "Qbpu nyyrf Thgmherqra xbaagr rf avpug üoremrhtra haq fb qnhregr rf avpug ynatr, ovf "
				+ "vuz rva cnne urvzgüpxvfpur Jreorgrkgre nhsynhregra, rf zvg Ybatr haq Cnebyr orgehaxra "
				+ "znpugra haq rf qnaa va vuer Ntraghe fpuyrccgra, jb fvr rf süe vuer Cebwrxgr jvrqre haq "
				+ "jvrqre zvßoenhpugra. Haq jraa rf avpug hztrfpuevrora jheqr, qnaa orahgmra Fvr rf " + "vzzreabpu.";

		String encryptedText = "";
		for (int i = 0; i < decryptedText.length(); i++) {
			char x = decryptedText.charAt(i);
			if (x >= 65 && x <= 77 || x >= 97 && x <= 109) {
				x += 13;
			} else if (x > 77 && x <= 90 || x > 109 && x <= 122) {
				x -= 13;
			}
			encryptedText += x;
		}

		System.out.println(decryptedText);
		System.out.println(encryptedText);
	}

}
