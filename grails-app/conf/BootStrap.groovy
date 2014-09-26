import com.petshop.app.Client
import com.petshop.app.Role
import com.petshop.app.User
import com.petshop.app.UserRole

class BootStrap {

    def init = { servletContext ->
        Role roleUser = new Role(authority: 'ROLE_USER').save(flush: true)
        Role roleAdmin = new Role(authority: 'ROLE_ADMIN').save(flush: true)

        User user = new User(
                username: 'my-user',
                password: 'my-password',
                enabled: true,
                accountExpired: false,
                accountLocked: false,
                passwordExpired: false
        ).save(flush: true)

        User userII = new User(
                username: 'adderlyjc',
                password: 'ilyrila',
                enabled: true,
                accountExpired: false,
                accountLocked: false,
                passwordExpired: false
        ).save(flush: true)

        UserRole.create(user, roleUser, true)
        UserRole.create(userII, roleAdmin, true)

        new Client(
                clientId: 'my-client',
                authorizedGrantTypes: ['authorization_code', 'refresh_token', 'implicit', 'password', 'client_credentials'],
                authorities: ['ROLE_CLIENT'],
                scopes: ['read', 'write'],
                redirectUris: ['http://myredirect.com']
        ).save(flush: true)

        new Client(
                clientId: 'globant',
                authorizedGrantTypes: ['password'],
                authorities: ['ROLE_CLIENT'],
                scopes: ['read'],
                redirectUris: ['http://myredirect.com']
        ).save(flush: true)

    }
    def destroy = {
    }
}
