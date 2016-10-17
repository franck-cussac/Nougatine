<%-- 
    Document   : inscrire_step1
    Created on : 26 mai 2016, 10:59:16
    Author     : kuungfu-sheep
--%>

<form action="Inscrire?inscrire=step2" method="post">
    <input type="text" name="pseudo" id="InputTextInscrire" class="InputText" placeholder="Pseudonyme" maxlength="50" required/><br/>
    <br/>
    <input type="email" name="email" id="InputTextInscrire" class="InputText" placeholder="E-mail" maxlength="60" required/><br/>
    <br/>
    <input type="password" name="password" id="InputTextInscrire" class="InputText" placeholder="Mot de passe" maxlength="50" required/><br/>
    <br/>
    <input type="password" name="passwordConf" id="InputTextInscrire" class="InputText" placeholder="Confirmer mot de passe" maxlength="50" required/><br/>
    <br/>
    <input id="InputSubmitInscrire" class="SubmitButton" type="submit" name="valider" value="Valider"/>
</form>