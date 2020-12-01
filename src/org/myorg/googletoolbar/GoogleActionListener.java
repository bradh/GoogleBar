package org.myorg.googletoolbar;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "File",
        id = "org.myorg.googletoolbar.GoogleActionListener"
)
@ActionRegistration(
        lazy = false,
        displayName = "NOT-USED"
)
@ActionReference(path = "Toolbars/File", position = 500)
@Messages("CTL_GoogleActionListener=Google")
public final class GoogleActionListener extends AbstractAction implements Presenter.Toolbar {

    @Override
    public void actionPerformed(ActionEvent e) {
        // delegated to toolbar
    }

    @Override
    public Component getToolbarPresenter() {
        return new GooglePanel();
    }
}
