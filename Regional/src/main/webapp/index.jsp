 <?xml version='1.0' encoding='UTF-8' ?>
  <!DOCTYPE html>
  <html xmlns="http://www.w3.org/1999/xhtml"
        xmlns:h="http://java.sun.com/jsf/html"
        xmlns:p="http://primefaces.org/ui" 
        xmlns:f="http://java.sun.com/jsf/core">
        
<body>
<h2>Usuarios do MySQL</h2>

<h:form>  
    <p:growl id="messages"/>
 
    <p:menubar>
        <p:submenu label="File" icon="ui-icon-document">
            <p:submenu label="New" icon="ui-icon-contact">
                <p:menuitem value="Project" url="#" />
                <p:menuitem value="Other" url="#" />
            </p:submenu>
            <p:menuitem value="Open" url="#" />
            <p:separator />
            <p:menuitem value="Quit" url="#" />
        </p:submenu>
 
        <p:submenu label="Edit" icon="ui-icon-pencil">
            <p:menuitem value="Undo" url="#" icon="ui-icon-arrowreturnthick-1-w" />
            <p:menuitem value="Redo" url="#" icon="ui-icon-arrowreturnthick-1-e" />
        </p:submenu>
 
        <p:submenu label="Help" icon="ui-icon-help">
            <p:menuitem value="Contents" url="#" />
            <p:submenu label="Search" icon="ui-icon-search">
                <p:submenu label="Text">
                    <p:menuitem value="Workspace" url="#" />
                </p:submenu>
                <p:menuitem value="File" url="#" />
            </p:submenu>
        </p:submenu>

			<p:submenu label="Actions" icon="ui-icon-gear">
				<p:submenu label="Ajax" icon="ui-icon-refresh">
					<p:menuitem value="Save" actionListener="#{menuView.save}"
						icon="ui-icon-disk" update="messages" />
					<p:menuitem value="Update" actionListener="#{menuView.update}"
						icon="ui-icon-arrowrefresh-1-w" update="messages" />
				</p:submenu>
				<p:submenu label="Non-Ajax" icon="ui-icon-newwin">
					<p:menuitem value="Delete" actionListener="#{menuView.delete}"
						icon="ui-icon-close" update="messages" ajax="false" />
				</p:submenu>
			</p:submenu>

			<p:menuitem value="Quit" url="http://www.primefaces.org"
				icon="ui-icon-close" />

			<f:facet name="options">
				<p:inputText style="margin-right:10px" placeholder="Search" />
				<p:commandButton type="button" value="Logout" icon="ui-icon-extlink" />
			</f:facet>
		</p:menubar>
</h:form>



</body>
</html>
