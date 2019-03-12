package typings
package zapierDashPlatformDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cursor extends js.Object {
  def get(): js.Promise[java.lang.String]
  def set(cursor: java.lang.String): js.Promise[scala.Null]
}

object Anon_Cursor {
  @scala.inline
  def apply(get: () => js.Promise[java.lang.String], set: java.lang.String => js.Promise[scala.Null]): Anon_Cursor = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[Anon_Cursor]
  }
}

