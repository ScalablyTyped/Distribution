package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object zoneJs {
  /**
    * Patch Function to allow user define their own monkey patch module.
    */
  type PatchFn = js.Function3[
    /* global */ typings.std.Window, 
    /* Zone */ typings.zoneJs.ZoneType, 
    /* api */ typings.zoneJs.ZonePrivate, 
    scala.Unit
  ]
}
