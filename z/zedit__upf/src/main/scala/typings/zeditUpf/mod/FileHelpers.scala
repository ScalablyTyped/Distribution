package typings.zeditUpf.mod

import typings.electron.Electron.FileFilter
import typings.fsJetpack.typesMod.FSJetpack
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileHelpers extends js.Object {
  
  /**
    * `fs-jetpack` instance with current working directory set to `appPath`.
    */
  var appDir: FSJetpack = js.native
  
  /**
    * Path to the application resource directory.
    * In a development environment this is just `.\app`,
    * but in production it is `.\resources\app.asar\app`.
    */
  var appPath: String = js.native
  
  /**
    * Extracts the ZIP archive at `filePath` to `destDir`.
    */
  def extractArchive(filePath: String, destDir: String): Unit = js.native
  def extractArchive(filePath: String, destDir: String, /**
    * @default false
    */
  empty: Boolean): Unit = js.native
  
  /**
    * Converts the input the `file://`` URL to a path.
    */
  def fileUrlToPath(fileUrl: String): String = js.native
  
  /**
    * @returns Date modified for the file at `filePath`.
    */
  def getDateModified(filePath: String): Date = js.native
  
  /**
    * @returns array of paths for all directories in the folder at `path`.
    */
  def getDirectories(path: String): js.Array[String] = js.native
  
  /**
    * Extracts and returns the parent directory path from `filePath`.
    */
  def getDirectory(filePath: String): js.UndefOr[String] = js.native
  
  def getFileBase(filePath: String): js.UndefOr[String] = js.native
  
  /**
    * Extracts and returns the file extension from `filePath`.
    * Returns undefined if the path does not end with a file extension.
    */
  def getFileExt(filePath: String): js.UndefOr[String] = js.native
  
  /**
    * Extracts and returns the filename from `filePath`.
    */
  def getFileName(filePath: String): js.UndefOr[String] = js.native
  
  /**
    * `fs-jetpack` instance with current working directroy set to the application root directory.
    */
  var jetpack: FSJetpack = js.native
  
  /**
    * If a file exists at `filePath`, it's read into memory and deserialized into a JavaScript object or array, which is then returned.
    * If a file does not exist at the specified path the `defaultValue` is returned.
    */
  def loadJsonFile[T](filePath: String, defaultValue: T): JSONAble | T = js.native
  
  /**
    * If a file exists at `filePath`, its contents are read into memory as a UTF8 string and returned.
    * If a file does not exist at the specified path the `defaultValue` is returned.
    */
  def loadTextFile[T](filePath: String, defaultValue: T): String | T = js.native
  
  /**
    * Opens the file at `filePath` with the default program configured to open it.
    */
  def openFile(filePath: String): Unit = js.native
  
  /**
    * Opens `url` in the user's web browser.
    * The URI protocol must be included in the URL. (e.g. `https://...`)
    */
  def openUrl(url: String): Unit = js.native
  
  /**
    * Converts the input `path` to a `file://` URL.
    */
  def pathToFileUrl(path: String): String = js.native
  
  /**
    * @returns path to the file saved by the user.
    * @returns undefined if the user didn't choose to save a file.
    *
    * @see {@link https://github.com/electron/electron/blob/master/docs/api/dialog.md#dialogshowsavedialogbrowserwindow-options-callback}
    */
  def saveFile(title: String, defaultPath: String): js.UndefOr[String] = js.native
  def saveFile(title: String, defaultPath: String, /**
    * @default []
    */
  filters: js.Array[FileFilter]): js.UndefOr[String] = js.native
  
  /**
    * Serializes the object passed through `value` to the file at `filePath`.
    * Creates the file if missing, else overwrites it.
    */
  def saveJsonFile(filePath: String, value: JSONAble): Unit = js.native
  def saveJsonFile(filePath: String, value: JSONAble, /**
    * @default false
    */
  minify: Boolean): Unit = js.native
  
  /**
    * Writes the text value to the file at `filePath`.
    * Creates the file if missing, else overwrites it.
    */
  def saveTextFile(filePath: String, value: String): Unit = js.native
  def saveTextFile(filePath: String, value: String, /**
    * @default utf8
    */
  encoding: String): Unit = js.native
  
  /**
    * @returns path to the directory selected by the user.
    * @returns undefined if the user didn't select a directory.
    */
  def selectDirectory(title: String): js.UndefOr[String] = js.native
  def selectDirectory(title: String, defaultPath: String): js.UndefOr[String] = js.native
  
  /**
    * @returns path to the file selected by the user.
    * @returns undefined if the user didn't select a file.
    *
    * @see {@link https://github.com/electron/electron/blob/master/docs/api/dialog.md#dialogshowopendialogbrowserwindow-options-callback}
    */
  def selectFile(title: String, defaultPath: String): js.UndefOr[String] = js.native
  def selectFile(title: String, defaultPath: String, /**
    * @default []
    */
  filters: js.Array[FileFilter]): js.UndefOr[String] = js.native
  
  /**
    * `fs-jetpack` instance with current working directory set to `userPath`.
    */
  var userDir: FSJetpack = js.native
  
  /**
    * Path to the application user data directory.
    * In a development environment this is located at `%appdata%\zEdit (Development)`,
    * and in production this is `%appdata%\zEdit`.
    */
  var userPath: String = js.native
}
