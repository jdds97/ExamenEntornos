package TestPersonalidad;

public class MétodosTest {

	public static void main(String[] args) {
		int preguntas;
		int respuestasInstagram;
		int respuestasWhatsapp;
		int respuestasTikTok;
		int respuestasTwitch;
		preguntas=respuestasInstagram,respuestasWhatsapp,respuestasTwitch,respuestasTikTok;
		if(respuestasInstagram>respuestasWhatsapp && respuestasInstagram>respuestasTikTok && respuestasInstagram>respuestasTwitch) {
			System.out.println("Eres un instagramer");
		}
		else if(respuestasWhatsapp>respuestasInstagram && respuestasWhatsapp>respuestasTikTok && respuestasWhatsapp>respuestasTwitch) {
			System.out.println("Estás todo el día con el whatsapp");
		}else if(respuestasTwitch>respuestasInstagram && respuestasTwitch>respuestasTikTok && respuestasTwitch>respuestasWhatsapp) {
			System.out.println("Eres un streamer");
		}else if(respuestasTikTok>respuestasInstagram && respuestasTikTok>respuestasWhatsapp && respuestasTikTok>respuestasTwitch) {
			
		}
	
	}
	
	}

}
