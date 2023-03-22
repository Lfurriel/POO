package aula01.classes;

//Classe do Pedro!
public class Arvore {
    private String nome;
    private float altura, CO2, glicose, luz;

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String arg) {
        nome = arg;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float arg) {
        arg = Math.abs(arg);
        altura = arg;
    }

    public float getCO2() {
        return CO2;
    }

    public void setCO2(float arg) {
        arg = Math.abs(arg);
        CO2 = arg;
    }

    public float getGlicose() {
        return glicose;
    }

    public void setGlicose(float arg) {
        arg = Math.abs(arg);
        glicose = arg;
    }

    public float getLuz() {
        return luz;
    }

    public void setLuz(float arg) {
        arg = Math.abs(arg);
        if (arg > 10) {
            arg = 10;
        }

        luz = arg;
    }


    public float fotosintetizar() {
        //returns the amount of oxygen produced
        float O2 = 0;

        if (luz < 5) {
            System.out.print("Luz insuficiente");
        }
        if (CO2 < 6) {
            System.out.print("CO2 insuficiente");
        }
        if (glicose > 1000) {
            System.out.print("Hipersaturação de glicose");
        }

        if (luz >= 5 && CO2 >= 6 && glicose <= 1000) {
            glicose += CO2 * 0.16;
            CO2 -= 6;

            O2 = (glicose + CO2) * 37;
        }

        return O2;
    }

}