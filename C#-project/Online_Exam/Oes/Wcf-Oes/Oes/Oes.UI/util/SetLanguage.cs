using System;
using System.ComponentModel;
using System.Threading;
using System.Windows.Forms;

namespace Oes.Entity.util
{
    public class SetLanguage
    {
        public static void ReSetLanguage(string language, Form form, Type type)
        {
            Thread.CurrentThread.CurrentUICulture = new System.Globalization.CultureInfo(language);

            if (form != null)
            {
                ComponentResourceManager resource = new ComponentResourceManager(type);
                resource.ApplyResources(form, "$this");
                AppLang(form, resource);
            }
        }

        private static void AppLang(Control control, ComponentResourceManager resources)
        {
            if (control is MenuStrip)
            {
                resources.ApplyResources(control, control.Name);
                MenuStrip ms = (MenuStrip)control;
                if (ms.Items.Count > 0)
                {
                    foreach (ToolStripMenuItem c in ms.Items)
                    {
                        AppLang(c, resources);
                    }
                }
            }
            foreach (Control c in control.Controls)
            {
                resources.ApplyResources(c, c.Name);
                AppLang(c, resources);
            }
        }

        private static void AppLang(ToolStripMenuItem item, System.ComponentModel.ComponentResourceManager resources)
        {
            if (item is ToolStripMenuItem)
            {
                resources.ApplyResources(item, item.Name);
                ToolStripMenuItem tsmi = (ToolStripMenuItem)item;
                if (tsmi.DropDownItems.Count > 0)
                {
                    foreach (ToolStripMenuItem c in tsmi.DropDownItems)
                    {
                        AppLang(c, resources);
                    }
                }
            }
        }
    }
}
