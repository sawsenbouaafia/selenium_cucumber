@login
Feature: Je souhaite verifier la page de connexion
  ETQ utilisateur je souhaite verifier la page de connexion

  @login-valide
  Scenario: Connexion avec des donnees valides
    Given Je visite le site nopcommerce
    When Je saisie l'adresse email "admin@yourstore.com"
    And Je saisie le mmot de passe "admin"
    And Je clique sur bouton login
    Then Je me redirige vers la page Home "Dashborad"
