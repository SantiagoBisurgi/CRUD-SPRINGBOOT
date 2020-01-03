function eliminar(id) {
	swal({
		  title: "¿Desea eliminar esta tarea?",
		  text: "Una vez realizada la acción, la tarea no estará disponible.",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((willDelete) => {
		  if (willDelete) {
			  $.ajax({
				  url:"/eliminartarea/"+id,
				  success: function(res){
					  console.log(res);
				  }
			  })
		    swal("Se ha eliminado correctamente la tarea.", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/listar"
		    	}
		    });
		  } else {
		    swal("La tarea continuará disponible.");
		  }
		});
}