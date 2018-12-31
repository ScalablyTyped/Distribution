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
  
  val danger: danger with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val important: important with java.lang.String = js.native
  val info: info with java.lang.String = js.native
  val primary: primary with java.lang.String = js.native
  val special: special with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val warning: warning with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[zuiLib.MessagerTypeEnum with java.lang.String] = js.native
}

