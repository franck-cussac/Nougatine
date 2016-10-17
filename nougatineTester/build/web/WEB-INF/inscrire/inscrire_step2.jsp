<%-- 
    Document   : inscrire_step1
    Created on : 26 mai 2016, 10:59:16
    Author     : kuungfu-sheep
--%>

<form action="Inscrire?inscrire=step3" method="post">
    <div id="TexteInscrire"><input type="radio" name="genre" value="homme" checked> Homme
        <input type="radio" name="genre" value="femme"> Femme <br/>
    <br/>
    <input type="text" name="prenom" id="InputTextInscrire" class="InputText" placeholder="Prénom" maxlength="20" required/><br/>
    <br/>
    <input type="text" name="nom" id="InputTextInscrire" class="InputText" placeholder="Nom" maxlength="20" required/><br/>
    <br/>
    Date de naissance : <br/>
    <jsp:include page="../tools/date_selector.jsp"/><br/>
    <br/>
    <input id="InputSubmitInscrire" class="SubmitButton" type="submit" name="valider" value="Valider"/></div>
</form>