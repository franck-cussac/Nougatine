<%-- 
    Document   : date_selector
    Created on : 30 mai 2016, 13:27:45
    Author     : kuungfu-sheep

<option value="1993">2005</option>
	<option value="1993">2004</option>
	<option value="1993">2003</option>
	<option value="1993">2002</option>
	<option value="1993">2001</option>
	<option value="1993">2000</option>
	<option value="1993">1999</option>
	<option value="1993">1998</option>
	<option value="1993">1997</option>
	<option value="1993">1996</option>
	<option value="1993">1995</option>
	<option value="1993">1994</option>
	<option value="1993">1993</option>
	<option value="1992">1992</option>
	<option value="1991">1991</option>
	<option value="1990">1990</option>
	<option value="1989">1989</option>
	<option value="1988">1988</option>
	<option value="1987">1987</option>
	<option value="1986">1986</option>
	<option value="1985">1985</option>
	<option value="1984">1984</option>
	<option value="1983">1983</option>
	<option value="1982">1982</option>
	<option value="1981">1981</option>
	<option value="1980">1980</option>
	<option value="1979">1979</option>
	<option value="1978">1978</option>
	<option value="1977">1977</option>
	<option value="1976">1976</option>
	<option value="1975">1975</option>
	<option value="1974">1974</option>
	<option value="1973">1973</option>
	<option value="1972">1972</option>
	<option value="1971">1971</option>
	<option value="1970">1970</option>
	<option value="1969">1969</option>
	<option value="1968">1968</option>
	<option value="1967">1967</option>
	<option value="1966">1966</option>
	<option value="1965">1965</option>
	<option value="1964">1964</option>
	<option value="1963">1963</option>
	<option value="1962">1962</option>
	<option value="1961">1961</option>
	<option value="1960">1960</option>
	<option value="1959">1959</option>
	<option value="1958">1958</option>
	<option value="1957">1957</option>
	<option value="1956">1956</option>
	<option value="1955">1955</option>
	<option value="1954">1954</option>
	<option value="1953">1953</option>
	<option value="1952">1952</option>
	<option value="1951">1951</option>
	<option value="1950">1950</option>
	<option value="1949">1949</option>
	<option value="1948">1948</option>
	<option value="1947">1947</option>
	<option value="1947">1946</option>
	<option value="1947">1945</option>
	<option value="1947">1944</option>
	<option value="1947">1943</option>
	<option value="1947">1942</option>
	<option value="1947">1941</option>
	<option value="1947">1947</option>
	<option value="1947">1947</option>
	<option value="1947">1947</option>
	<option value="1947">1947</option>
	<option value="1947">1947</option>
	<option value="1947">1947</option>
	<option value="1947">1947</option>
	<option value="1947">1947</option>
	<option value="1947">1947</option>
	<option value="1947">1947</option>
	<option value="1947">1947</option>
	<option value="1947">1947</option>
	<option value="1947">1947</option>
	<option value="1947">1947</option>
	<option value="1947">1947</option>
	<option value="1947">1947</option>
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<select id="SelectInscrire" name="day" required>
    <option value="" disabled="" selected>Jours</option>
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
    <option value="6">6</option>
    <option value="7">7</option>
    <option value="8">8</option>
    <option value="9">9</option>
    <option value="10">10</option>
    <option value="11">11</option>
    <option value="12">12</option>
    <option value="13">13</option>
    <option value="14">14</option>
    <option value="15">15</option>
    <option value="16">16</option>
    <option value="17">17</option>
    <option value="18">18</option>
    <option value="19">19</option>
    <option value="20">20</option>
    <option value="21">21</option>
    <option value="22">22</option>
    <option value="23">23</option>
    <option value="24">24</option>
    <option value="25">25</option>
    <option value="26">26</option>
    <option value="27">27</option>
    <option value="28">28</option>
    <option value="29">29</option>
    <option value="30">30</option>
    <option value="31">31</option>
</select>


<select id="SelectInscrire" name="month" required>
    <option value="" disabled="" selected>Mois</option>
    <option value="Janvier">Janvier</option>
    <option value="F�vrier">F�vrier</option>
    <option value="Mars">Mars</option>
    <option value="Avril">Avril</option>
    <option value="Mai">Mai</option>
    <option value="Juin">Juin</option>
    <option value="Juillet">Juillet</option>
    <option value="Aout">Aout</option>
    <option value="Septembre">Septembre</option>
    <option value="Octobre">Octobre</option>
    <option value="Novembre">Novembre</option>
    <option value="D�cembre">D�cembre</option>
</select>

<select id="SelectInscrire" name="year" required>
    <option value="" disabled="" selected>Ann�e</option>
    
    <c:forEach begin="0" end="116" varStatus="loop">
        <option value="${2016 - loop.index}">${2016 - loop.index}</option>
    </c:forEach>
</select>
