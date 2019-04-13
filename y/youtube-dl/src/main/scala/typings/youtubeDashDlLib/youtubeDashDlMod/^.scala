package typings
package youtubeDashDlLib.youtubeDashDlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("youtube-dl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    url: java.lang.String,
    arg: js.Array[java.lang.String],
    opt: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): Youtubedl = js.native
  def exec(
    url: java.lang.String,
    args: js.Array[java.lang.String],
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def getExtractors(callback: js.Function2[/* err */ js.Any, /* output */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  def getExtractors(
    descriptions: scala.Boolean,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def getExtractors(
    descriptions: scala.Boolean,
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def getInfo(
    url: java.lang.String,
    args: js.Array[java.lang.String],
    callback: js.Function2[/* err */ js.Any, /* output */ Info, scala.Unit]
  ): scala.Unit = js.native
  def getInfo(
    url: java.lang.String,
    args: js.Array[java.lang.String],
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ Info, scala.Unit]
  ): scala.Unit = js.native
  def getInfo(url: java.lang.String, callback: js.Function2[/* err */ js.Any, /* output */ Info, scala.Unit]): scala.Unit = js.native
  def getSubs(
    url: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def getSubs(
    url: java.lang.String,
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def getThumbs(
    url: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def getThumbs(
    url: java.lang.String,
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
}

