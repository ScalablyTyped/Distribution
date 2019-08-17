package typings.zookeeper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zookeeperMod {
  import typings.zookeeper.Anon_Auth

  type ACL = Double | Anon_Auth
  type Callback[T] = js.Function3[/* rc */ Double, /* error */ String, /* value */ T, Unit]
  type acl_callback = js.Function4[/* rc */ Double, /* error */ String, /* acl */ js.Array[ACL], /* stat */ Stat, Unit]
  type child2_callback = js.Function4[
    /* rc */ Double, 
    /* error */ String, 
    /* children */ js.Array[String], 
    /* stat */ Stat, 
    Unit
  ]
  type watch_callback = js.Function3[/* type */ Double, /* state */ Double, /* path */ String, Unit]
}
