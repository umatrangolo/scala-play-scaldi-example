package managers

import scaldi.Module

class ManagersModule extends Module {
  bind [UsersManager] to new UsersManagerImpl initWith { _.init() }
}
