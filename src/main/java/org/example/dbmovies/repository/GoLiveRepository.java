package org.example.dbmovies.repository;

import org.example.dbmovies.entity.Movie;

import java.io.*;

public class GoLiveRepository {



    public void add(Movie movie) {
        FileWriter writer;
        try{
            writer=new FileWriter("X:\\Films\\Vus\\Tracking\\movies.csv",true);
            writer.write(movie.getTitle()+"\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void addMP4File(Movie movie){
        String sourceFilePath = "X:\\Films\\Vus\\Tracking\\fichierSource.mp4"; // Chemin du fichier source
        String destinationFilePath = "X:\\Films\\Vus\\PlexDB\\"+movie.getTitle()+".mp4"; // Chemin du fichier de destination

        try {
            // Créer un objet File pour le fichier source
            File sourceFile = new File(sourceFilePath);

            // Vérifier que le fichier source existe et est un fichier
            if (!sourceFile.exists() || !sourceFile.isFile()) {
                System.out.println("Le fichier source spécifié n'existe pas ou n'est pas un fichier.");
                return;
            }

            // Créer un objet File pour le fichier de destination
            File destinationFile = new File(destinationFilePath);

            // Créer un flux d'entrée pour lire le contenu du fichier source
            try (FileInputStream inputStream = new FileInputStream(sourceFile)) {

                // Créer un flux de sortie pour écrire le contenu dans le nouveau fichier
                try (FileOutputStream outputStream = new FileOutputStream(destinationFile)) {

                    // Lire le contenu du fichier source par blocs de 4 Ko (4096 octets) et écrire dans le fichier de destination
                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, bytesRead);
                    }

                    System.out.println("Copie du fichier terminée avec succès.");
                }
            }
        } catch (IOException e) {
            System.out.println("Une erreur s'est produite lors de la copie du fichier : " + e.getMessage());
        }
    }




}
