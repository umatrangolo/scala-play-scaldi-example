package stores

import scaldi.Module

class StoresModule extends Module {
  bind[UsersStore] to new UsersStoreMapImpl
  bind[DeptsStore] to new DeptsStorePostGresImpl initWith { _.start() } destroyWith { _.stop() }
}
