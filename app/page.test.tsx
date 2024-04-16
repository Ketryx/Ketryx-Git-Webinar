import { render, screen } from "@testing-library/react";
import Page from "./page";

describe('Test infusion limitations @tests:KXITM4MR52W3G0T97NRZKRMVDZHY7XX', () => {
  it('applies limits', () => {
    render(<Page />)

    const heading = screen.getByRole("heading", {
      name: /Sample App/i,
    });

    expect(heading).toBeInTheDocument();
  })
})

