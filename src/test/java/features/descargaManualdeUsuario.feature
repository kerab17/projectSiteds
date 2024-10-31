Feature: Realizar la descarga del manual de usuario

  Scenario: descarga pdf

    Given hago el login a la web Siteds
    When realizo la descarga del manual
    Then la descarga se realiza correctamente