<%@page import="model.CreditModel"%>
<%
CreditModel model = (CreditModel) request.getAttribute("model");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Simulateur</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
	<div class="container my-5 col-md-6">
		<div class="card ">
			<div class="card-header bg-primary text-center">Simulateur de
				credit</div>
			<div class="card-body">

				<form action="controleur" method="post">
					<div class="mb-3">
						<label class="form-label">Montant :</label> <input type="text"
							class="form-control" name="montant"
							value="<%=model.getMontant()%>">
					</div>
					<div class="mb-3">
						<label class="form-label">Taux :</label> <input type="text"
							class="form-control" name="taux" value="<%=model.getTaux()%>">
					</div>
					<div class="mb-3">
						<label class="form-label">Durée :</label> <input type="text"
							class="form-control" name="duree" value="<%=model.getDuree()%>">
					</div>
					<button type="submit" class="btn btn-primary">Calculer</button>
					<div class="mb-3">
						<label class="form-label">Mensualité :</label>
						<input type="text" class="form-control" disabled="disabled"
							value="<%=model.getMensualite()%>">

					</div>
				</form>

			</div>
		</div>
	</div>
	
	<%-- <div>
		<form action="controleur" method="post">
		<table>
			<tr>
				<td>Montant :</td>
				<td><input type="text" name="montant" value="<%=model.getMontant()%>"></td>
				<td>F CFA</td>
			</tr>
			<tr>
				<td>Taux :</td>
				<td><input type="text" name="taux" value="<%=model.getTaux()%>"></td>
				<td>%</td>
			</tr>
			<tr>
				<td>Durée :</td>
				<td><input type="text" name="duree" value="<%=model.getDuree() %>"></td>
				<td>Mois</td>
			</tr>
		</table>
		<button type="submit">Calculer</button>
	</form>
	</div>
	 --%>
</body>
</html>