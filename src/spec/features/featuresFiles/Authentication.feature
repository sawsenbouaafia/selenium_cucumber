@login
Feature: Je souhaite verifier la page de connexion
  ETQ utilisateur je souhaite verifier la page de connexion

  @login-valide
  Scenario: Connexion avec des donnees valides
    Given Je visite le site nopcommerce
    When Je saisis l'adresse email "admin@yourstore.com"
    And Je saisis le mot de passe "admin"
    And Je clique sur bouton login
    Then Je me redirige vers la page Home "Dashborad"