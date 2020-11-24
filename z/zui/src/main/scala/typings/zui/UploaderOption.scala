package typings.zui

import typings.zui.anon.Crop
import typings.zui.anon.Error
import typings.zui.anon.Height
import typings.zui.anon.Id
import typings.zui.anon.Maxfilesize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * uploader
  */
@js.native
trait UploaderOption extends js.Object {
  
  var autoUpload: js.UndefOr[Boolean] = js.native
  
  var browseByClickList: js.UndefOr[Boolean] = js.native
  
  var browse_button: js.UndefOr[String] = js.native
  
  var chunk_size: js.UndefOr[String] = js.native
  
  var deleteActionOnDone: js.UndefOr[Boolean] = js.native
  
  var deleteConfirm: js.UndefOr[Boolean | String] = js.native
  
  var dropPlaceholder: js.UndefOr[Boolean] = js.native
  
  var drop_element: js.UndefOr[String] = js.native
  
  var fileFormater: js.UndefOr[js.Function3[/* $file */ JQuery, /* file */ FileObj, /* status */ STATUS, Unit]] = js.native
  
  var fileIconCreator: js.UndefOr[
    js.Function3[/* fileType */ String, /* file */ FileObj, /* uploader */ Uploader, Unit]
  ] = js.native
  
  var fileList: js.UndefOr[String] = js.native
  
  var fileTemplate: js.UndefOr[String] = js.native
  
  var file_data_name: js.UndefOr[String] = js.native
  
  var filters: js.UndefOr[Maxfilesize] = js.native
  
  var flash_swf_url: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var limitFilesCount: js.UndefOr[Boolean | Double] = js.native
  
  var max_retries: js.UndefOr[Double] = js.native
  
  var multi_selection: js.UndefOr[Boolean] = js.native
  
  var multipart: js.UndefOr[Boolean] = js.native
  
  var multipart_params: js.UndefOr[js.Object | CallBack] = js.native
  
  var onBeforeUpload: js.UndefOr[js.Function1[/* file */ FileObj, Unit]] = js.native
  
  var onChunkUploaded: js.UndefOr[js.Function2[/* file */ FileObj, /* responseObject */ ResponseObject, Unit]] = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  
  var onFileUploaded: js.UndefOr[js.Function2[/* file */ FileObj, /* responseObject */ ResponseObject, Unit]] = js.native
  
  var onFilesAdded: js.UndefOr[js.Function1[/* fiels */ js.Array[FileObj], Unit]] = js.native
  
  var onFilesRemoved: js.UndefOr[js.Function1[/* files */ js.Array[FileObj], Unit]] = js.native
  
  var onInit: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onQueueChanged: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onStateChanged: js.UndefOr[js.Function1[/* status */ STATUS, Unit]] = js.native
  
  var onUploadComplete: js.UndefOr[js.Function1[/* files */ js.Array[FileObj], Unit]] = js.native
  
  var onUploadFile: js.UndefOr[js.Function1[/* file */ FileObj, Unit]] = js.native
  
  var onUploadProgress: js.UndefOr[js.Function1[/* file */ FileObj, Unit]] = js.native
  
  var previewImageIcon: js.UndefOr[Boolean] = js.native
  
  var previewImageSize: js.UndefOr[Height] = js.native
  
  var qiniu: js.UndefOr[js.Object] = js.native
  
  var removeUploaded: js.UndefOr[Boolean] = js.native
  
  var rename: js.UndefOr[Boolean] = js.native
  
  var renameActionOnDone: js.UndefOr[Boolean] = js.native
  
  var renameByClick: js.UndefOr[Boolean] = js.native
  
  var renameExtension: js.UndefOr[Boolean] = js.native
  
  var resize: js.UndefOr[Crop] = js.native
  
  var responseHandler: js.UndefOr[Boolean | CallBack] = js.native
  
  var runtimes: js.UndefOr[String] = js.native
  
  var sendFileId: js.UndefOr[Boolean] = js.native
  
  var sendFileName: js.UndefOr[Boolean] = js.native
  
  var silverlight_xap_url: js.UndefOr[String] = js.native
  
  var staticFiles: js.UndefOr[js.Array[Id]] = js.native
  
  var statusCreator: js.UndefOr[
    js.Function3[/* total */ UploadProgress, /* state */ STATUS, /* uploader */ Uploader, Unit]
  ] = js.native
  
  var unique_names: js.UndefOr[Boolean] = js.native
  
  var uploadedMessage: js.UndefOr[Boolean] = js.native
  
  var url: String = js.native
}
object UploaderOption {
  
  @scala.inline
  def apply(url: String): UploaderOption = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploaderOption]
  }
  
  @scala.inline
  implicit class UploaderOptionOps[Self <: UploaderOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpload(value: Boolean): Self = this.set("autoUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpload: Self = this.set("autoUpload", js.undefined)
    
    @scala.inline
    def setBrowseByClickList(value: Boolean): Self = this.set("browseByClickList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowseByClickList: Self = this.set("browseByClickList", js.undefined)
    
    @scala.inline
    def setBrowse_button(value: String): Self = this.set("browse_button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowse_button: Self = this.set("browse_button", js.undefined)
    
    @scala.inline
    def setChunk_size(value: String): Self = this.set("chunk_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunk_size: Self = this.set("chunk_size", js.undefined)
    
    @scala.inline
    def setDeleteActionOnDone(value: Boolean): Self = this.set("deleteActionOnDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteActionOnDone: Self = this.set("deleteActionOnDone", js.undefined)
    
    @scala.inline
    def setDeleteConfirm(value: Boolean | String): Self = this.set("deleteConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteConfirm: Self = this.set("deleteConfirm", js.undefined)
    
    @scala.inline
    def setDropPlaceholder(value: Boolean): Self = this.set("dropPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropPlaceholder: Self = this.set("dropPlaceholder", js.undefined)
    
    @scala.inline
    def setDrop_element(value: String): Self = this.set("drop_element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrop_element: Self = this.set("drop_element", js.undefined)
    
    @scala.inline
    def setFileFormater(value: (/* $file */ JQuery, /* file */ FileObj, /* status */ STATUS) => Unit): Self = this.set("fileFormater", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFileFormater: Self = this.set("fileFormater", js.undefined)
    
    @scala.inline
    def setFileIconCreator(value: (/* fileType */ String, /* file */ FileObj, /* uploader */ Uploader) => Unit): Self = this.set("fileIconCreator", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFileIconCreator: Self = this.set("fileIconCreator", js.undefined)
    
    @scala.inline
    def setFileList(value: String): Self = this.set("fileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileList: Self = this.set("fileList", js.undefined)
    
    @scala.inline
    def setFileTemplate(value: String): Self = this.set("fileTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileTemplate: Self = this.set("fileTemplate", js.undefined)
    
    @scala.inline
    def setFile_data_name(value: String): Self = this.set("file_data_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile_data_name: Self = this.set("file_data_name", js.undefined)
    
    @scala.inline
    def setFilters(value: Maxfilesize): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setFlash_swf_url(value: String): Self = this.set("flash_swf_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlash_swf_url: Self = this.set("flash_swf_url", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setLimitFilesCount(value: Boolean | Double): Self = this.set("limitFilesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitFilesCount: Self = this.set("limitFilesCount", js.undefined)
    
    @scala.inline
    def setMax_retries(value: Double): Self = this.set("max_retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_retries: Self = this.set("max_retries", js.undefined)
    
    @scala.inline
    def setMulti_selection(value: Boolean): Self = this.set("multi_selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMulti_selection: Self = this.set("multi_selection", js.undefined)
    
    @scala.inline
    def setMultipart(value: Boolean): Self = this.set("multipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipart: Self = this.set("multipart", js.undefined)
    
    @scala.inline
    def setMultipart_paramsFunction0(value: () => Unit): Self = this.set("multipart_params", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMultipart_params(value: js.Object | CallBack): Self = this.set("multipart_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipart_params: Self = this.set("multipart_params", js.undefined)
    
    @scala.inline
    def setOnBeforeUpload(value: /* file */ FileObj => Unit): Self = this.set("onBeforeUpload", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeUpload: Self = this.set("onBeforeUpload", js.undefined)
    
    @scala.inline
    def setOnChunkUploaded(value: (/* file */ FileObj, /* responseObject */ ResponseObject) => Unit): Self = this.set("onChunkUploaded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChunkUploaded: Self = this.set("onChunkUploaded", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnFileUploaded(value: (/* file */ FileObj, /* responseObject */ ResponseObject) => Unit): Self = this.set("onFileUploaded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFileUploaded: Self = this.set("onFileUploaded", js.undefined)
    
    @scala.inline
    def setOnFilesAdded(value: /* fiels */ js.Array[FileObj] => Unit): Self = this.set("onFilesAdded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFilesAdded: Self = this.set("onFilesAdded", js.undefined)
    
    @scala.inline
    def setOnFilesRemoved(value: /* files */ js.Array[FileObj] => Unit): Self = this.set("onFilesRemoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFilesRemoved: Self = this.set("onFilesRemoved", js.undefined)
    
    @scala.inline
    def setOnInit(value: () => Unit): Self = this.set("onInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
    
    @scala.inline
    def setOnQueueChanged(value: () => Unit): Self = this.set("onQueueChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnQueueChanged: Self = this.set("onQueueChanged", js.undefined)
    
    @scala.inline
    def setOnStateChanged(value: /* status */ STATUS => Unit): Self = this.set("onStateChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStateChanged: Self = this.set("onStateChanged", js.undefined)
    
    @scala.inline
    def setOnUploadComplete(value: /* files */ js.Array[FileObj] => Unit): Self = this.set("onUploadComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUploadComplete: Self = this.set("onUploadComplete", js.undefined)
    
    @scala.inline
    def setOnUploadFile(value: /* file */ FileObj => Unit): Self = this.set("onUploadFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUploadFile: Self = this.set("onUploadFile", js.undefined)
    
    @scala.inline
    def setOnUploadProgress(value: /* file */ FileObj => Unit): Self = this.set("onUploadProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUploadProgress: Self = this.set("onUploadProgress", js.undefined)
    
    @scala.inline
    def setPreviewImageIcon(value: Boolean): Self = this.set("previewImageIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewImageIcon: Self = this.set("previewImageIcon", js.undefined)
    
    @scala.inline
    def setPreviewImageSize(value: Height): Self = this.set("previewImageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewImageSize: Self = this.set("previewImageSize", js.undefined)
    
    @scala.inline
    def setQiniu(value: js.Object): Self = this.set("qiniu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQiniu: Self = this.set("qiniu", js.undefined)
    
    @scala.inline
    def setRemoveUploaded(value: Boolean): Self = this.set("removeUploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveUploaded: Self = this.set("removeUploaded", js.undefined)
    
    @scala.inline
    def setRename(value: Boolean): Self = this.set("rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRename: Self = this.set("rename", js.undefined)
    
    @scala.inline
    def setRenameActionOnDone(value: Boolean): Self = this.set("renameActionOnDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenameActionOnDone: Self = this.set("renameActionOnDone", js.undefined)
    
    @scala.inline
    def setRenameByClick(value: Boolean): Self = this.set("renameByClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenameByClick: Self = this.set("renameByClick", js.undefined)
    
    @scala.inline
    def setRenameExtension(value: Boolean): Self = this.set("renameExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenameExtension: Self = this.set("renameExtension", js.undefined)
    
    @scala.inline
    def setResize(value: Crop): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setResponseHandlerFunction0(value: () => Unit): Self = this.set("responseHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResponseHandler(value: Boolean | CallBack): Self = this.set("responseHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseHandler: Self = this.set("responseHandler", js.undefined)
    
    @scala.inline
    def setRuntimes(value: String): Self = this.set("runtimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimes: Self = this.set("runtimes", js.undefined)
    
    @scala.inline
    def setSendFileId(value: Boolean): Self = this.set("sendFileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendFileId: Self = this.set("sendFileId", js.undefined)
    
    @scala.inline
    def setSendFileName(value: Boolean): Self = this.set("sendFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendFileName: Self = this.set("sendFileName", js.undefined)
    
    @scala.inline
    def setSilverlight_xap_url(value: String): Self = this.set("silverlight_xap_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilverlight_xap_url: Self = this.set("silverlight_xap_url", js.undefined)
    
    @scala.inline
    def setStaticFilesVarargs(value: Id*): Self = this.set("staticFiles", js.Array(value :_*))
    
    @scala.inline
    def setStaticFiles(value: js.Array[Id]): Self = this.set("staticFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticFiles: Self = this.set("staticFiles", js.undefined)
    
    @scala.inline
    def setStatusCreator(value: (/* total */ UploadProgress, /* state */ STATUS, /* uploader */ Uploader) => Unit): Self = this.set("statusCreator", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteStatusCreator: Self = this.set("statusCreator", js.undefined)
    
    @scala.inline
    def setUnique_names(value: Boolean): Self = this.set("unique_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique_names: Self = this.set("unique_names", js.undefined)
    
    @scala.inline
    def setUploadedMessage(value: Boolean): Self = this.set("uploadedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadedMessage: Self = this.set("uploadedMessage", js.undefined)
  }
}
