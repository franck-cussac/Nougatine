<%-- 
    Document   : paris_step1
    Created on : 25 mai 2016, 15:32:04
    Author     : kuungfu-sheep
--%>


<form id="FormParis" action="Parier" method="get">
    <div id="ParisSelectStep1" class="ParisSelect">
        <select id="SelectGame" name="jeu" required>
            <option value="" disabled="" selected >Choisis ton jeu</option>
            <option value="Hearthstone">Hearthstone</option>
            <option value="Heroes of the Storm">Heroes of the Storm</option>
            <option value="Overwatch">Overwatch</option>
        </select>

        <select id="SelectTournament" name="tournois" required>
            <option value="" disabled="" selected >Choisis ton tournois</option>
            <option value="Zotac">Zotac cup</option>
            <option value="DreamHack">DreamHack</option>
            <option value="Blizzcon">Blizzcon</option>
        </select>
    </div>
    <input class="SubmitButton" id="ParisSubmitStep1" type="submit" name="submit" value="Rechercher"/>
    <input type="hidden" name="parier" value="step2"/>
</form>