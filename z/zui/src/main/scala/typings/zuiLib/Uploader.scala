package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Uploader extends js.Object {
  def destroy(): scala.Unit = js.native
  def disableBrowse(disable: scala.Boolean): scala.Unit = js.native
  def getFile(id: java.lang.String): FileObj = js.native
  def getFiles(): js.Array[FileObj] = js.native
  def getState(): STATUS = js.native
  def getTotal(): UploadProgress = js.native
  def hideMessage(): scala.Unit = js.native
  def isStarted(): scala.Boolean = js.native
  def isStopped(): scala.Boolean = js.native
  def removeFile(file: FileObj): scala.Unit = js.native
  def showFile(file: js.Array[FileObj]): scala.Unit = js.native
  def showFile(file: FileObj): scala.Unit = js.native
  def showMessage(message: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  def showMessage(message: java.lang.String, `type`: java.lang.String, time: scala.Double): scala.Unit = js.native
  def showStatus(): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

