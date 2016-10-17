<%-- 
    Document   : login
    Created on : 26 mai 2016, 11:00:27
    Author     : kuungfu-sheep
--%>

<form id="FormLogin" action="Login" method="post">
    <input type="text" name="user" id="LoginInput" class="InputText" placeholder="Pseudonyme ou e-mail" maxlength="50" required /><br/>
    <br/>
    <br/>
    <br/>
    <input type="password" name="password" id="LoginInput" class="InputText" placeholder="Mot de passe" maxlength="50" required /><br/>
    <br/>
    <br/>
    <input id="LoginButton" class="SubmitButton" type="submit" name="LoginButton" value="Connexion"/><br/>
    <br/>
    <a href="">Mot de passe oublié ? Cliquez ici</a><br/>
    <a href="BoutonsHeader?inscrire=''">Pas encore inscris ? C'est par ici</a>
</form>