/**
 * @license Copyright (c) 2003-2017, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see LICENSE.md or http://ckeditor.com/license
 */

CKEDITOR.editorConfig = function( config ) {
	// Define changes to default configuration here. For example:
	// config.language = 'fr';
	// config.uiColor = '#AADC6E';
	
	config.toolbar = [
	                  
[/* 'Source', '-', 'Preview', '-', 'Templates' */],
                 
[ 'Cut', 'Copy', 'Paste', 'PasteText', 'PasteFromWord', '-',
                 

                 
 
                 
'SpellChecker', 'Scayt' ],
                 
[ /*'Undo', 'Redo', '-', 'Find', 'Replace', '-', 'SelectAll',
                 
'RemoveFormat' */],
                 
[ /*'Form', 'Checkbox', 'Radio', 'TextField',
                 
 
                 
'Textarea', 'Select',  'HiddenField'*/ ],
 
//»»ÐÐ·û
/*   '/' ,  */
                 
[ 'Bold', 'Italic', 'Underline', 'Strike', '-', 'Subscript',
                 
'Superscript' ],
                 
 
                 
[ 
                 
 ],
                 
[ 'JustifyLeft', 'JustifyCenter', 'JustifyRight', 'JustifyBlock' ],
                 
 
                 
[ ],
                 
['Image', 'Table','HorizontalRule', 'Smiley',
                 
'SpecialChar', ], '/',
                 
[ 'Format', 'Font', 'FontSize' ],
                 
 
                 
[ 'TextColor', 'BGColor' ],
                 
[ 'Maximize',  '-' ] ];
	
	
	config.skin='kama';
};
