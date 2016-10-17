<%-- 
    Document   : inscrire_step1
    Created on : 26 mai 2016, 10:59:16
    Author     : kuungfu-sheep
--%>

<form action="Inscrire?inscrire=step4" method="post">
    <input type="text" name="ville" id="InputTextInscrire" class="InputText" placeholder="Ville" maxlength="30" required/><br/>
    <br/>
    <input type="text" name="adresse" id="InputTextInscrire" class="InputText" placeholder="Adresse" maxlength="60" required/><br/>
    <br/>
    <input type="text" name="code_postal" id="InputTextInscrire" class="InputText" placeholder="Code postal" maxlength="60" required/><br/>
    <br/>
    <input id="InputSubmitInscrire" class="SubmitButton" type="submit" name="valider" value="Valider"/>
</form>