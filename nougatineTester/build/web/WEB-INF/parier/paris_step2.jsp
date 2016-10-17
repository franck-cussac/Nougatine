<%-- 
    Document   : paris_step1
    Created on : 25 mai 2016, 15:32:04
    Author     : kuungfu-sheep
--%>


<form id="FormParis" action="Parier" method="get">
    <div id="ParisSelectStep2" class="ParisSelect">
        <select id="SelectMatch" name="match" required>
            <option value="" disabled="" selected >Choisis ton match</option>
            <option value="match1">Yogg vs Odemian</option>
            <option value="match2">Torlk vs Maverick</option>
            <option value="match3">BestMarmotte vs Oliech</option>
        </select>

        <select id="SelectVainqueur" name="winner" required>
            <option value="" disabled="" selected >Choisis ton champion</option>
            <option value="joueur1">Yogg</option>
            <option value="joueur2">Odemian</option>
        </select>
        
        <input type="text" id="InputTextParisStep2" name="argent" class="InputText" placeholder="Argent parié" maxlength="3"/>
    </div><br/>
    <br/>
    <input class="SubmitButton" id="ParisSubmitStep2" type="submit" name="submit" value="Valider"/>
    <input type="hidden" name="parier" value="step3"/>
</form>