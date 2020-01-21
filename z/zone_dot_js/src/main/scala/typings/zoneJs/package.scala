package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zoneJs {
  /**
    * Patch Function to allow user define their own monkey patch module.
    */
  type PatchFn = js.Function3[
    /* global */ typings.std.Window_, 
    /* Zone */ typings.zoneJs.ZoneType, 
    /* api */ typings.zoneJs.ZonePrivate, 
    scala.Unit
  ]
}
