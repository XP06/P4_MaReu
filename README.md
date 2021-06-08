# P4_MaReu
Créez une application de gestion de réunions

OpenClassrooms

Ce dépôt contient une application pour le P4 D.A.A.

Instructions pour importer, exécuter et compiler ce projet :

**IMPORT DE L’APPLICATION **

Deux méthodes disponibles :

**Méthode a : **

Cloné le Repository du projet en local sur votre ordinateur en passant par GitHub en réalisant les opérations suivantes :

-	Utiliser le lien suivant pour accéder au répertoire PROJET.
![image](https://user-images.githubusercontent.com/63601884/121186635-990ec200-c867-11eb-8cb2-dbaa4f5a2946.png)

-	Se rendre à la racine du répertoire.

-	Cliquer sur le bouton vert « CODE » et cliquer sur l’icône à droite du lien HTTPS.

-	Ouvrir Gitbash taper la commande git clone et coller le lien (clic droit puis paste).

![image](https://user-images.githubusercontent.com/63601884/121187032-ebe87980-c867-11eb-97d6-e2de68f63562.png)

-	 le répertoire est cloné en local sur votre ordinateur. 

-	Aller dans le répertoire users\****\(Parcourir le répertoire vous trouverez le dossier à déplacer soit dans AndroidStudioProjets ou Github).

**Méthode b : **

Télécharger le projet sur votre ordinateur en réalisant les opérations suivantes :

-	Utiliser le lien suivant pour accéder au répertoire PROJET.

 ![image](https://user-images.githubusercontent.com/63601884/121187177-15090a00-c868-11eb-8707-4c6264e4fa1f.png)


-	Se rendre à la racine du répertoire.

-	Cliquer sur le bouton vert « CODE » et « Télécharger le ZIP ».



-	Aller dans le répertoire téléchargement de votre Ordinateur.
-	Décompresser l’archive.zip    soit :![image](https://user-images.githubusercontent.com/63601884/121187533-7204c000-c868-11eb-9a28-98800e32189c.png)

	Dans le répertoire utilisateurs\* ***\AndroidStudioProjects .
       Ou
	Dans le répertoire users\****\GitHub.

** Compilation / Exécution**

Ouvrir Android Studio

Pour ouvrir le projet :

File,Open, sélectionner le projet dans l’arborescence et cliquer sur OK. 

  Barre d’outils interface projet![image](https://user-images.githubusercontent.com/63601884/121187738-aa0c0300-c868-11eb-9ef9-8e01e06bf3a9.png)     


  Dans la boite de dialogue choisir « app »![image](https://user-images.githubusercontent.com/63601884/121187903-d889de00-c868-11eb-94e2-0337a5b4a5e8.png)


  Dans la boite de dialogue choisir un Emulateur ou en créer un ou utiliser votre smartphone. ![image](https://user-images.githubusercontent.com/63601884/121187936-e0498280-c868-11eb-8ff3-0d7f29a91f7c.png)

 	Cliquer sur le bouton Run App pour exécuter l’application.

![image](https://user-images.githubusercontent.com/63601884/121188545-83020100-c869-11eb-8b29-ec26521a38ba.png)


L’application est compilée et exécutée, celle-ci est fonctionnelle.

 ** Créez une application de gestion de réunions **
 
 Ma Réu – Application de gestion de réunions.

![image](https://user-images.githubusercontent.com/63601884/121189156-1c311780-c86a-11eb-8863-5d374115da9b.png)

![image](https://user-images.githubusercontent.com/63601884/121189226-2e12ba80-c86a-11eb-9012-f6b98481e364.png)
![image](https://user-images.githubusercontent.com/63601884/121189284-3ec33080-c86a-11eb-9c1a-ceb59155f3b3.png)
![image](https://user-images.githubusercontent.com/63601884/121189301-42ef4e00-c86a-11eb-8f8a-8590ff9ece69.png)
![image](https://user-images.githubusercontent.com/63601884/121189323-48e52f00-c86a-11eb-9aff-92e0d5103bab.png)
![image](https://user-images.githubusercontent.com/63601884/121189420-63b7a380-c86a-11eb-82ec-30055cc54d5d.png)
![image](https://user-images.githubusercontent.com/63601884/121189449-69ad8480-c86a-11eb-81a6-622f2d6e8424.png)
![image](https://user-images.githubusercontent.com/63601884/121189493-7205bf80-c86a-11eb-886d-0df67a74f1ba.png)

                                                           
Identification du projet et de la mission Nom et nature : 
Dans le cadre de la croissance de l’entreprise, la gestion des réunions devient un enjeu primordial pour les collaborateurs.
L’entreprise souhaite donc créer une application de gestion de réunions, Maréu, utilisable en interne par l’ensemble des collaborateurs. 
Origine : Le temps passé pour trouver une salle est de plus en plus long. 
Enjeu : Faire gagner du temps à l’ensemble des collaborateurs. Données représentatives 
Salles de réunions disponibles : 10 
Temps moyen passé en réunion : 45 minutes 
Temps moyen pour trouver une salle : 17 minutes 
Nombre moyen de participants : 3 
Analyse de l’existant À ce jour, l’application n’existe pas. 

3 Cadrage du projet 
● Liste des réunions comprenant : ○ l’heure de la réunion ; ○ le lieu de la réunion ; ○ le sujet de la réunion ; ○ la liste des participants (adresses mail). 
● Ajout d’une réunion. 
● Suppression d’une réunion. 
● Filtre des réunions par date ou par lieu.
● Gestion de l’affichage responsive sur toutes les tailles de téléphone et de tablette Android, en modes portrait et paysage. 
● Application supportant Android 5.0 (API21) et ses versions supérieures. Phasage 
● Phase 1 : Création de l’application comprenant toutes les fonctionnalités demandées. 
● Phase 2 : Réalisation d’un test unitaire et d’un test instrumentalisé par fonctionnalité. Spécificités 
● L’application sera un POC, la persistance des données ne sera donc pas gérée. Qu’est-ce que cela signifie concrètement ? Si l’utilisateur effectue une rotation de son appareil ou que l’application est redémarrée, les réunions précédemment entrées devront être supprimées. 
● Bonnes pratiques de développement respectées : ○ code correctement indenté ; ○ longueur des classes inférieure à 500 lignes ; ○ longueur des contrôleurs (Fragments et/ou Activités) inférieure à 300 lignes ; ○ longueur des méthodes inférieure à 50 lignes. 
● Code de l’application hébergé sur GitHub..

Le graphiste de l’entreprise, vous fournit les premiers écrans de l’application. Il les a réalisés avec Sketch, un logiciel qui permet de faire des maquettes très utilisé parmi les graphistes.

 

Contraintes techniques :

Langage utilisé : Java
