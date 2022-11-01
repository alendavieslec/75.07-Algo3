package ej2;

import java.util.ArrayList;

public class Usuario {
        private String nombre;
        private ArrayList<Chat> chats;

        public Usuario(String nombre) {
		this.nombre = nombre;
		this.chats = new ArrayList<Chat>();
	}

        private int buscarChat(Usuario destinatario) {
                int i = 0;
                /* while(i < chats.size()) {
                        if(chats.get(i).destinatario == destinatario){
                                return i;
                        }
                } */
                for (Chat chat: chats) {
                        if(chats.get(i).destinatario == destinatario){
                                return i;
                        }
                }
                return -1;    
        }

        public void enviarMensaje(String contenido, Usuario destinatario) {

                if(buscarChat(destinatario) == -1){
                        Chat chat = new Chat(destinatario);
                }
                Mensaje mensaje = new Mensaje(contenido, this.nombre);

               

        }
        
}
