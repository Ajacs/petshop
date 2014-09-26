<%@ page import="com.petshop.app.Dog" %>



<div class="fieldcontain ${hasErrors(bean: dogInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="dog.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="description" required="" value="${dogInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dogInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="dog.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${dogInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dogInstance, field: 'registerAt', 'error')} required">
	<label for="registerAt">
		<g:message code="dog.registerAt.label" default="Register At" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="registerAt" precision="day"  value="${dogInstance?.registerAt}"  />

</div>

