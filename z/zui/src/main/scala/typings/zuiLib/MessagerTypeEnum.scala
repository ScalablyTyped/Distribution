package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessagerTypeEnum extends js.Object

/**
  * messager
  */
@JSGlobal("MessagerTypeEnum")
@js.native
object MessagerTypeEnum extends js.Object {
  @js.native
  sealed trait danger
    extends zuiLib.MessagerTypeEnum
  
  @js.native
  sealed trait default
    extends zuiLib.MessagerTypeEnum
  
  @js.native
  sealed trait important
    extends zuiLib.MessagerTypeEnum
  
  @js.native
  sealed trait info
    extends zuiLib.MessagerTypeEnum
  
  @js.native
  sealed trait primary
    extends zuiLib.MessagerTypeEnum
  
  @js.native
  sealed trait special
    extends zuiLib.MessagerTypeEnum
  
  @js.native
  sealed trait success
    extends zuiLib.MessagerTypeEnum
  
  @js.native
  sealed trait warning
    extends zuiLib.MessagerTypeEnum
  
  /* 5 */ val danger: danger with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 6 */ val important: important with scala.Double = js.native
  /* 3 */ val info: info with scala.Double = js.native
  /* 1 */ val primary: primary with scala.Double = js.native
  /* 7 */ val special: special with scala.Double = js.native
  /* 2 */ val success: success with scala.Double = js.native
  /* 4 */ val warning: warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[zuiLib.MessagerTypeEnum with scala.Double] = js.native
}

