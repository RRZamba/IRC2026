



<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">

        
    <!-- Link do CSS/Bootstrap-->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- Link do JS/Bootstrap-->

    <title>Login</title>

   
  </head>

  <body>
  <br><br><br><br><br><br><br><br><br>
   <!-- Primeira linha -->
  <div class="col-md-12">
 
    <!-- Espaço vazio para central.  -->  
       <div class="col-md-5">
       </div>
	
	<div class="container-fluid col-md-2" style="padding:15px">
      <form role="form" class="smallwidth" action="Dologin.php" method="POST">
        <h3 class="formheader">Login Empresa</h3>
        <div class="form-group has-feedback">
          <input type="text" class="form-control input-default" name="login" placeholder="Login" required />
          <i class="glyphicon glyphicon-user form-control-feedback"></i> </div>
        <div class="form-group has-feedback">
          <input type="password" class="form-control input-default" name="senha" placeholder="senha" required />
          <i class="glyphicon glyphicon-lock form-control-feedback"></i> </div>
        <div class="checkbox text-left">
        </div>
        <div class="form-group text-center">
          <button class="btn btn-default col-md-6" style="float:inherit" type="submit">Login</button>
        </div>
        <div class="form-group text-center" style="margin-bottom: 0px;"> <a href="#">Esqueci a Senha</a> </div>
        <hr />
        <div class="form-group text-center" style="margin-bottom: 0px;">
          <text>Não Possui Registro ?</text>
          &nbsp;<a href="../cadastro_empresa/CadastroEmpresa.php">Registrar</a> </div>
          
          <BR><BR>
          <center>
          <label style="color:red; font-size:300%; text-align:center;">
            <?php echo $erro;?>    
          </label>
        </center>

      </form>
    </div>

	
	
	
	
	
	
  </body>
</html>
