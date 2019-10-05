package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zoneDotJs {
  import typings.std.Window

  /**
    * Patch Function to allow user define their own monkey patch module.
    */
  type _PatchFn = js.Function3[/* global */ Window, /* Zone */ ZoneType, /* api */ _ZonePrivate, Unit]
}
